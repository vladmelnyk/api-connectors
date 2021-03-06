<?php
/**
 * ApiKey
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */
/**
 *  Copyright 2015 SmartBear Software
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
/**
 * ApiKey Class Doc Comment
 *
 * @category    Class
 * @description 
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class ApiKey implements ArrayAccess
{
    /**
      * Array of property to type mappings. Used for (de)serialization 
      * @var string[]
      */
    static $swaggerTypes = array(
        'id' => 'string',
        'secret' => 'string',
        'name' => 'string',
        'nonce' => 'Number',
        'cidr' => 'string',
        'permissions' => 'string[]',
        'enabled' => 'bool',
        'user_id' => 'Number',
        'created' => '\DateTime'
    );
  
    /** 
      * Array of attributes where the key is the local name, and the value is the original name
      * @var string[] 
      */
    static $attributeMap = array(
        'id' => 'id',
        'secret' => 'secret',
        'name' => 'name',
        'nonce' => 'nonce',
        'cidr' => 'cidr',
        'permissions' => 'permissions',
        'enabled' => 'enabled',
        'user_id' => 'userId',
        'created' => 'created'
    );
  
    /**
      * Array of attributes to setter functions (for deserialization of responses)
      * @var string[]
      */
    static $setters = array(
        'id' => 'setId',
        'secret' => 'setSecret',
        'name' => 'setName',
        'nonce' => 'setNonce',
        'cidr' => 'setCidr',
        'permissions' => 'setPermissions',
        'enabled' => 'setEnabled',
        'user_id' => 'setUserId',
        'created' => 'setCreated'
    );
  
    /**
      * Array of attributes to getter functions (for serialization of requests)
      * @var string[]
      */
    static $getters = array(
        'id' => 'getId',
        'secret' => 'getSecret',
        'name' => 'getName',
        'nonce' => 'getNonce',
        'cidr' => 'getCidr',
        'permissions' => 'getPermissions',
        'enabled' => 'getEnabled',
        'user_id' => 'getUserId',
        'created' => 'getCreated'
    );
  
    
    /**
      * $id 
      * @var string
      */
    protected $id;
    
    /**
      * $secret 
      * @var string
      */
    protected $secret;
    
    /**
      * $name 
      * @var string
      */
    protected $name;
    
    /**
      * $nonce 
      * @var Number
      */
    protected $nonce;
    
    /**
      * $cidr 
      * @var string
      */
    protected $cidr;
    
    /**
      * $permissions 
      * @var string[]
      */
    protected $permissions;
    
    /**
      * $enabled 
      * @var bool
      */
    protected $enabled;
    
    /**
      * $user_id 
      * @var Number
      */
    protected $user_id;
    
    /**
      * $created 
      * @var \DateTime
      */
    protected $created;
    

    /**
     * Constructor
     * @param mixed[] $data Associated array of property value initalizing the model
     */
    public function __construct(array $data = null)
    {
        if ($data != null) {
            $this->id = $data["id"];
            $this->secret = $data["secret"];
            $this->name = $data["name"];
            $this->nonce = $data["nonce"];
            $this->cidr = $data["cidr"];
            $this->permissions = $data["permissions"];
            $this->enabled = $data["enabled"];
            $this->user_id = $data["user_id"];
            $this->created = $data["created"];
        }
    }
    
    /**
     * Gets id
     * @return string
     */
    public function getId()
    {
        return $this->id;
    }
  
    /**
     * Sets id
     * @param string $id 
     * @return $this
     */
    public function setId($id)
    {
        
        $this->id = $id;
        return $this;
    }
    
    /**
     * Gets secret
     * @return string
     */
    public function getSecret()
    {
        return $this->secret;
    }
  
    /**
     * Sets secret
     * @param string $secret 
     * @return $this
     */
    public function setSecret($secret)
    {
        
        $this->secret = $secret;
        return $this;
    }
    
    /**
     * Gets name
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }
  
    /**
     * Sets name
     * @param string $name 
     * @return $this
     */
    public function setName($name)
    {
        
        $this->name = $name;
        return $this;
    }
    
    /**
     * Gets nonce
     * @return Number
     */
    public function getNonce()
    {
        return $this->nonce;
    }
  
    /**
     * Sets nonce
     * @param Number $nonce 
     * @return $this
     */
    public function setNonce($nonce)
    {
        
        $this->nonce = $nonce;
        return $this;
    }
    
    /**
     * Gets cidr
     * @return string
     */
    public function getCidr()
    {
        return $this->cidr;
    }
  
    /**
     * Sets cidr
     * @param string $cidr 
     * @return $this
     */
    public function setCidr($cidr)
    {
        
        $this->cidr = $cidr;
        return $this;
    }
    
    /**
     * Gets permissions
     * @return string[]
     */
    public function getPermissions()
    {
        return $this->permissions;
    }
  
    /**
     * Sets permissions
     * @param string[] $permissions 
     * @return $this
     */
    public function setPermissions($permissions)
    {
        
        $this->permissions = $permissions;
        return $this;
    }
    
    /**
     * Gets enabled
     * @return bool
     */
    public function getEnabled()
    {
        return $this->enabled;
    }
  
    /**
     * Sets enabled
     * @param bool $enabled 
     * @return $this
     */
    public function setEnabled($enabled)
    {
        
        $this->enabled = $enabled;
        return $this;
    }
    
    /**
     * Gets user_id
     * @return Number
     */
    public function getUserId()
    {
        return $this->user_id;
    }
  
    /**
     * Sets user_id
     * @param Number $user_id 
     * @return $this
     */
    public function setUserId($user_id)
    {
        
        $this->user_id = $user_id;
        return $this;
    }
    
    /**
     * Gets created
     * @return \DateTime
     */
    public function getCreated()
    {
        return $this->created;
    }
  
    /**
     * Sets created
     * @param \DateTime $created 
     * @return $this
     */
    public function setCreated($created)
    {
        
        $this->created = $created;
        return $this;
    }
    
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset 
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->$offset);
    }
  
    /**
     * Gets offset.
     * @param  integer $offset Offset 
     * @return mixed 
     */
    public function offsetGet($offset)
    {
        return $this->$offset;
    }
  
    /**
     * Sets value based on offset.
     * @param  integer $offset Offset 
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        $this->$offset = $value;
    }
  
    /**
     * Unsets offset.
     * @param  integer $offset Offset 
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->$offset);
    }
  
    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) {
            return json_encode(get_object_vars($this), JSON_PRETTY_PRINT);
        } else {
            return json_encode(get_object_vars($this));
        }
    }
}
